function a(str) {
	var r = str.split(""); // splits the string
	res = r.sort().join(""); // sort the array and joins to form a string
	return res; // returns the result
}

console.log(a("jayashree"));
