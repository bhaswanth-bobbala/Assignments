function myfun(){
    var result = document.getElementById("result");
    var Fahrenheit = document.getElementById("input").value;
    if(Fahrenheit == "" || isNaN(Fahrenheit)){
        result.innerHTML = "enter valid scale";
    }
    else{
        var Celsius = (Fahrenheit - 32) * 5.0/9.0;
        result.innerHTML = Celsius;
    }
    
}
