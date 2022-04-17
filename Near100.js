function n(a,b){
  var a1=100-a
  var b1=100-b
  
  if(a1>b1){
    return b + " is nearest"
  }else{
    return a + " is nearest"
  }
}
console.log(n(10,9))
