function reqReadyStateChange() {
    var in_sys = document.getElementById("in").value;

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/post");
    xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    xhr.send('str='+in_sys);
    var res = document.getElementById("result");
    xhr.onreadystatechange = function() { 
    if(xhr.statusText=="OK")
        res.innerHTML = xhr.responseText;
    else if(xhr.statusText=="Not Found")
        alert("Ресурс не найден");
    else
        alert(xhr.statusText);
    };
}