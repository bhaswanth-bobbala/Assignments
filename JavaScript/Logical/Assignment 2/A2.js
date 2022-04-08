for (var i = 0; i < 3; i++){
    var string = "*";
    var num = prompt("Enter Number between 1 to 30");
    if(num <= 30 && num <= 1 || !isNaN(num)){
        document.write(string.repeat(num)+"<br>");
    }
    else{
        document.write("Number is not between 1 to 30<br>")
    }
}
