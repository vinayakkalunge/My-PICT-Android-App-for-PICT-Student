<?PHP
include_once("connection.php");
if( isset($_POST['txtUsername']) && isset($_POST['txtPassword']) ) {
    $username = $_POST['txtUsername'];
    $password = $_POST['txtPassword'];
    $firstname = $_POST['txtfirstname'];
    $lastname = $_POST['txtlastname'];

    $query = "INSERT INTO tbl_client(firstname,lastname, username, password) VALUES('$firstname', '$lastname', '$username', '$password')";
    $result = mysqli_query($conn, $query);

    if($result->num_rows > 0){
        if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
            echo "success";
            exit;
        }
        header("location: index.php"); //replace index.php with your url
        echo "Registered successfully";
    } else{
        echo "Registration Failed <br/>";
    }
}
?>
<html>
<head><title>Register</title></head>
<body>
<h1>Login Example|<a href=”http://www.kosalgeek.com”>KosalGeek</a></h1>
<form action="<?PHP $_PHP_SELF ?>" method="post">
    firstname <input type="text" name="txtfirstname" value="" /><br/>
    lastname <input type="text" name="txtlastname" value="" /><br/>
    Username <input type="text" name="txtUsername" value="" /><br/>
    Password <input type="password" name="txtPassword" value="" /><br/>
    Password2 <input type="password" name="txtPassword2" value="" /><br/>
    <input type="submit" name="btnSubmit" value="Login"/>
</form>
</body>
</html>