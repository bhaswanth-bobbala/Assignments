var number = parseInt(prompt("Enter Number")),
    output = [],
    sNumber = number.toString();

for (var i = 0, len = sNumber.length; i < len; i += 1) {
    output.push(sNumber.charAt(i));
}

document.write(output);
