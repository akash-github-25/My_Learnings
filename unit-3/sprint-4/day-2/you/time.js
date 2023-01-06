function time(data){
    if(data<60000){
        let h=data%1000;
        return `${(data-h)/1000} seconds`
    }else if(data>=60000 && data<60000*60){
        let h=data%(60000)
        let s=data-h
        let x=s/60000
        if(h!=0){
            return `${x} minutes ${h} seconds`
        }else{
            return `${x} minutes`
        }
    }else if(data>=60000*60){
        let h=data%(60*60000)
        let m=h/(1000)
        let s=data-h
        let x=s/(60*60000)
        if(h>60000){
            let p=h%(1000*60)
            let s=Math.floor(p/(1000))
            let f=(h-p)/(60000)
            return `${x} hours ${f} minutes ${s} seconds`
        }else if(m!=0){
            if(m<60){
            return `${x} hours ${m} seconds`
            }else{
                let f=m/60
                let e=Math.floor(m%60)
                  return `${x} hours ${f} minutes ${e} seconds`
            }
        }else{
            return `${x} hours`
        }
    }
}
export default time