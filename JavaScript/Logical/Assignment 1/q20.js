var A = ['a','b','c'];
var B = [1,2,3];
var C = [];
if(A.length == B.length){
    for (var i = 0; i < A.length; i++){
        C.push(A[i],B[i]);
    }
}
document.write(C);