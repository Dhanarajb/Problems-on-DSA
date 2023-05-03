function removeDuplicates(arr) {
  let i = 0;
  for (let j = 1; j < arr.length; j++) {
    if (arr[j] !== arr[i]) {
      i++;
      arr[i] = arr[j];
    }
  }

  return arr.slice(0, i + 1);
}

const result = removeDuplicates([2, 3, 2, 1, 3, 4, 2, 3, 3, 3]);
console.log(result); // [2, 3, 1, 4]

// function removeDuplicates(arr) {
//   for (let i = 0; i < arr.length; i++) {
//     for (let j = i + 1; j < arr.length; j++) {
//       if (arr[i] === arr[j]) {
//         arr.splice(j, 1);
//         j--;
//       }
//     }
//   }
//   return arr;
// }

// const arr = [1, 2, 2, 3, 3, 3, 4, 5];
// console.log(removeDuplicates(arr)); // [1, 2, 3, 4, 5]
