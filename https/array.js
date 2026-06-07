let n = parseInt(prompt("How many elements do you want to enter?"));
let arrDynamic = [];
let dynamicSum = 0;

for (let i = 0; i < n; i++) {
  let val = parseFloat(prompt(`Enter element ${i + 1}:`));
  arrDynamic.push(val);
  dynamicSum += val;
}
console.log("Dynamic Array Sum:", dynamicSum);