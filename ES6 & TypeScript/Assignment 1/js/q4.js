"use strict";
let names = ["Tom", "Ivan", "Jerry"];
let objects = [];
var object = function (name) {
    this.name = name,
        this.length = name.length;
};
for (let i of names) {
    var object1 = new object(i);
    objects.push(JSON.stringify(object1));
}
document.write(objects);
//# sourceMappingURL=q4.js.map