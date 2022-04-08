function myFunction(a){
    var array = [1,2,3,4,5,6,7,8,9,10];
    var max = array.includes(a);
    document.write(max);
}
myFunction(parseInt(prompt("Enter Number")));