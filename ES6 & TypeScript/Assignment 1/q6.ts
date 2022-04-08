let model = "vivobook123";
let deskNo = "XN123S";
let Name = "Manindra";
let problems = "Display shutdown";

let problem = {
    model,
    deskNo,
    Name,
    problems
};

function box(model,
    deskNo,
    Name,
    problems){

        let complain = `${model}<br> ${deskNo}<br> ${Name}<br> ${problems}`;
        return {complain};

}

let p = box(model,deskNo,Name,problems);

document.write(p.complain);

