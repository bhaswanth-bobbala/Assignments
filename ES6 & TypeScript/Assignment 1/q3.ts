let order = {
    id:123,
    title:"Hide&seek",
    price:20,
    printOrder:function(){
        document.write("Id : "+this.id+"<br>"+this.title+"<br>");
    },
    getPrice:function(){
        document.write(""+this.price);
    }
}

let order1 = Object.assign(order);

order1.printOrder();
order1.getPrice();
document.write("<br>"+JSON.stringify(order1));