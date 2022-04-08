var lowerNumber = parseInt(prompt('Enter lower number: '));
var higherNumber = parseInt(prompt('Enter higher number: '));

for (var i = lowerNumber; i <= higherNumber; i++) {
    var flag = 0;
    for (var j = 2; j < i; j++) {
        if (i % j == 0) {
            flag = 1;
            break;
        }
    }
    if (i > 1 && i!=2 && flag == 0) {
        document.writeln(i+"<br>");
    }
}
