var num = prompt("Q5:Enter Number:");
var r = 0;
for(i=1;i<=num;i++){
    if(i % 3 === 0){
        r=r+i;   
    }
}
document.write("Sum of number till "+num+"="+r);