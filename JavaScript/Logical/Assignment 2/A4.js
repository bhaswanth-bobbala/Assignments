var result = document.getElementById("div1")
var input = null;
var num1,num2;
while(input == null){
    var option = window.prompt("Enter your Option\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exponent\n6. Mean\n7. Quit",1);
    if(option == 1){
        num1 = parseInt(window.prompt("Enter Number 1:",1));
        num2 = parseInt(window.prompt("Enter Number 2:",1));
        if(isNaN(num1) || isNaN(num2) || num1 == "" || num2 == ""){
            result.innerHTML = "Enter valid  inputs";
        }
        else{
            result.innerHTML = "Sum of "+num1+" and "+num2+" = "+(num1+num2);
        }
    }
    else if(option == 2){
        num1 = parseInt(window.prompt("Enter Number 1:",1));
        num2 = parseInt(window.prompt("Enter Number 2:",1));
        if(isNaN(num1) || isNaN(num2) || num1 == "" || num2 == ""){
            result.innerHTML = "Enter valid  inputs";
        }
        else{
            result.innerHTML = "Sub of "+num1+" and "+num2+" = "+(num1-num2);
        }
    }
    else if(option == 3){
        num1 = parseInt(window.prompt("Enter Number 1:",1));
        num2 = parseInt(window.prompt("Enter Number 2:",1));
        if(isNaN(num1) || isNaN(num2) || num1 == "" || num2 == ""){
            result.innerHTML = "Enter valid  inputs";
        }
        else{
            result.innerHTML = "Mul of "+num1+" and "+num2+" = "+(num1*num2);
        }
    }
    else if(option == 4){
        num1 = parseInt(window.prompt("Enter Dividen:",1));
        num2 = parseInt(window.prompt("Enter Diviser:",1));
        if(isNaN(num1) || isNaN(num2) || num1 == "" || num2 == ""){
            result.innerHTML = "Enter valid  inputs";
        }
        else{
            result.innerHTML = "Div of "+num1+" and "+num2+" = "+(num1/num2);
        }
    }
    else if(option == 5){
        num1 = parseInt(window.prompt("Enter Base Number:",1));
        num2 = parseInt(window.prompt("Enter Exponent Number:",1));
        if(isNaN(num1) || isNaN(num2) || num1 == "" || num2 == ""){
            result.innerHTML = "Enter valid  inputs";
        }
        else{
            result.innerHTML = "Mul of "+num1+" and "+num2+" = "+(Math.pow(num1,num2));
        }
    }
    else if (option == 6){
        var count = 1;
        var num = null;
        var mean = 0;
        while(num != "***"){
            num = parseInt(window.prompt("Enter number "+count+"/n else enter *** to find mean"));
            if(isNaN(num) || num == ""){
                result.innerHTML = "number "+count+" is not valid input";
            }
            else{
                mean += num;
            }
            count++;
        }
        result.innerHTML = mean/count;
    }
    else if (option == 7){
        input = "exit";
    }
    else{
        result.innerHTML = "Enter valid  input";
    }
}