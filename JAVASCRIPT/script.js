
/*let a=prompt("Enter the Number");

if(a%5==0){
    console.log("the number is multiple of 5");
}
else{
    console.log("this is not multiple of 5");
}*/

/*let a=prompt("Enter the persentage you got:");
if(a>90){
    console.log("A grade");
}
else if(a<90 && a>50){
    console.log("B grade");
}
else{
    console.log("Fail");
}*/
// for(let i=0;i<10;i++){
//     console.log("dear");
// }
// const Student={
//  Name:"Devesh",
//  address:"India",
//  post:"AI researcher",
//  favno:5,


// }
// for(let key in Student ){
//     console.log("key is ",key,"value is",Student[key]);
// }
// let i=0;
// while(i<=100){
// console.log(i);
// i=i+2;
// }

// let userinput=prompt("Enter the  value");
// let guess=25;
// while(userinput!= guess){
// userinput=prompt("you entered wrong guess");
// }

// console.log("Congrats! you doned ")
// let Fullname=prompt("Enter full name to make user name ");
// let result=`Your Username is @${Fullname}${Fullname.length}`;
// console.log(result);

// let n =Number(prompt("Enter the value of n"));
// let arr = [];

// for (let i = 0; i < n; i++) {
//     arr[i] = prompt("Enter value of element " + i);
// }
// for (let i = 0; i < n; i++) {
//     console.log(arr[i]);
// }
// for(let number of arr){
//     console.log(number);
// }

// let n = Number(prompt("Enter the Number of Students"));
// let arr = [];
// let sum = 0;

// for (let i = 0; i < n; i++) {
//     arr[i] = Number(prompt("Enter Marks Roll No. of Student " + i));
// }

// for (let i = 0; i < n; i++) {
//     console.log(arr[i]);
//     sum += arr[i];
// }

// let average = sum / arr.length;

// console.log("Average:", average);

let sumdiscount=0;
let sum1=0;
let price =[];
let n= Number(prompt("Enter the numbe of itmes : "));
for(let i=0;i<n;i++){
    price[i]=Number(prompt(`Enter the price of item ${i}   `));
sumdiscount+=(price[i]*0.1);
sum1+=price[i];
}
let totalAmmount=sum1-sumdiscount;
console.log("After 10 % reduction the Ammount is :",totalAmmount);

 

