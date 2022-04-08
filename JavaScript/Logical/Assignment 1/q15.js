var array = [1,2,3,4,5,6,7,8,9,10];
var sum = 0;
function myFunction(){
    for (var i in array){
    sum += parseInt(array[i]);
    }
    document.write(sum);
}
myFunction();