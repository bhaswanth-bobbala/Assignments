var array = [1,2,3,4,5,6,7,8,9,10];
var sum = 0;
function myFunction(){
    array.forEach((x,i)=>{
        if(i%2 != 0){
           document.write(x+"\n"); 
        }
    });
    
}
myFunction();