async function main(){
    let rit=await fetch("http://127.0.0.1:3000/api/products")
    let data=await rit.json()
    console.log(data)
    return data
  }
  // main()
  export default main