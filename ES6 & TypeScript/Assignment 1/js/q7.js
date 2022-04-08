"use strict";
let array1 = ["red", "blue", "green", "black"];
let [, , colour,] = array1;
document.write(colour + "<br>");
let details = {
    name7: "naga",
    address: {
        street: "Balaji nagar",
        city: "kurnool",
        state: "AP",
        pincode: 518006
    }
};
let { name7, address } = details;
document.write(name7 + "<br>");
document.write(address.pincode);
//# sourceMappingURL=q7.js.map