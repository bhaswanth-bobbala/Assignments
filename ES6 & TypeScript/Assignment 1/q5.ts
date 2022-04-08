let add = function(num1=10,num2=11){
    return num1+num2;
}

function userFriends(username ,...array){
    document.write("<br><br>"+username+"<br>");
    for(let i of array){
        document.write(i+"<br><br>")
    }
}

function printCapitalNames(name1,name2,name3,name4,name5){
    document.write(name1.toUpperCase()+"<br>");
    document.write(name2.toUpperCase()+"<br>");
    document.write(name3.toUpperCase()+"<br>");
    document.write(name4.toUpperCase()+"<br>");
    document.write(name5.toUpperCase()+"<br>");

}

let array = ["naga","manindra","abhi","krishna","chaitanya"];

document.write(add());
userFriends("Max",array);
printCapitalNames(...array);