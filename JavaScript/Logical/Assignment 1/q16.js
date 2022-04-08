var string = prompt("Enter String");
if(string.split('').reverse().join('') == string ){
    document.write("Given String is Palindrom");
}
else{
    document.write("Given String is not Palindrom");
}
