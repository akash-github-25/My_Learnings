let url="https://example.com?foo=1&bar=2";

function searchParams(url,param){
    let u =new URL(url);
    let params=new URLSearchParams(u.search);
    let f=params.get(param); //only foo
    return f;
}
 export default searchParams;