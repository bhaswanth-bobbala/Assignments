function person(fname,lname,age,skills,dateofbirth,address,married,profession)
 {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;
 }
var amithab=new
person("amithab","bachan",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
var abhisheik=new person("abhisheik",21,"HTML","08/06/1997","false","jr analyst")
abhisheik=Object.create(amithab);
print=function()
{
 document.write(JSON.stringify(amithab)+"<br>");
 document.write(JSON.stringify(abhisheik.lname)+"<br>");
 document.write(JSON.stringify(abhisheik.address)+"<br>");
}();

var Aaradhya=Object.assign(abhisheik,amithab);
print1=function()
{
 document.write(JSON.stringify(Aaradhya)+"<br>");
 document.write(JSON.stringify(Aaradhya.lname)+"<br>");
 document.write(JSON.stringify(Aaradhya.address));
}();
