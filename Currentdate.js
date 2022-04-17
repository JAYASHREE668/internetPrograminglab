let dateObj = new Date();
            let mm = String(dateObj.getMonth() + 1).padStart(2, '0');
            let dd = String(dateObj.getDate()).padStart(2, '0');
            let yyyy= dateObj.getFullYear();
            let output = mm + '/' + dd+ '/' + yyyy+','+mm+'/'+dd+'/'+yyyy;
            console.log(output)
