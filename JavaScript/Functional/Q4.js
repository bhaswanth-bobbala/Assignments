var arr=[1,2,3,4,5];
var arr1 = [1,4,9,16,25];
function square(x){
    return x*x;
}
function map(arr,func){
    for(var i=0;i<arr.length;i++){
        arr[i]=func(arr[i]);
    }
    return arr;
}
document.write(map(arr,square)+"<br>");
document.write(map(arr1,Math.sqrt));