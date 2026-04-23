let naming = prompt("Please enter your name");

if (naming === "utpal") {
    document.getElementById("head").innerHTML = "You are a good boy";
}
else if (naming) {
    document.getElementById("head").innerHTML = "Hello " + naming;
}

else {
    document.getElementById("head").innerHTML = "Enter your name";
}

   function add() {
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);

    document.getElementById("pic").innerHTML = a + b;
}
