var number = parseInt(prompt("Enter Number")),
    output = [],
    sNumber = number.toString();

for (var i = 0, len = sNumber.length; i < len; i += 1) {
    output.push(parseInt(sNumber.charAt(i)));
}
    function findSum(A, N) {
    if (N <= 0)
        return 0;
    return (findSum(A, N - 1) + A[N - 1]);
    }
    function findSub(A, N) {
    if (N <= 0)
        return 0;
    return (findSub(A, N - 1) - A[N - 1]);
    }
    function findMul(A, N) {
    if (N <= 0)
        return 0;
    return (findMul(A, N - 1) * A[N - 1]);
    }
    function findDiv(A, N) {
    if (N <= 0)
        return 0;
    return (findSum(A, N - 1) / A[N - 1]);
}


document.write(findSum(output,output.length));
document.write(findSub(output,output.length));
document.write(findMul(output,output.length));
document.write(findDiv(output,output.length));
