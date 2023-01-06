function calculatetax(data){
    if(data>=250000 && data<500000){
        let t=data*10/100;
        let x=t*50/100;
        // let f=data-x;
        return x
    }else if(data>=500000 && data<1000000){
       let t=data*20/100;
       let x=t*30/100;
        // f=data-x;
         return x
    }else if(data>=1000000){
       let t=data*30/100;
       let x=t*10/100;
        if(x<50000){
        // f=data-x
        return x
        }else{
            // f=data-50000
            return 50000
        }
    }
}
export default calculatetax