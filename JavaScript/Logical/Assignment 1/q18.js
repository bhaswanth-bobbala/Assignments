function on_all(){
    for (var i = 1 ; i <= 20; i++){
        for (var j=1; j<=i ;j++){
            if(j*j==i){
                document.write(i+"<br>");
            }
        }
    }
}
on_all();