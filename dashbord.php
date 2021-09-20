<?php
session_start();
if(!isset($_SESSION['userdata'])){
	header("location:../project/homepage.php");
}
$userdata=$_SESSION['userdata'];
$candidatedata=$_SESSION['candidatedata'];
if($userdata['status']==0){
	$staus='<strong style="color:red">Not Voted</strong>';
}
else{
	$staus='<strong style="color:green">Voted</strong>';	
}
?>
<html>
<head>
	<title>dashboard</title>
	<link rel="stylesheet" href="homepage.css">
</head>
<body>
	<style>
#btnback{
	padding: 10px;
    border-radius: 8px;
    width: 10%;
    background-color: blue;
    color: white;
    font-size: medium;
    border: 1px solid black;
	float:left;
}
#btnlogout{
	padding: 10px;
    border-radius: 8px;
    width: 10%;
    background-color: blue;
    color: white;
    font-size: medium;
    border: 1px solid black;
	float:right;
}
#profile{
	float:left;
	background:white;
	width: 30%;
	

}#group{
	float:right;
	background:white;
	width: 60%;
}#votebtn{
	padding: 10px;
    border-radius: 8px;
    width: 10%;
    background-color: blue;
    color: white;
    font-size: medium;
    border: 1px solid black;

}
#voted{
	padding: 10px;
    border-radius: 8px;
    width: 10%;
    background-color: green;
    color: white;
    font-size: medium;
    border: 1px solid black;

}

	</style>
	<a href="../project/dashbord.php"><button id="btnback">Back</button></a>
	<a href="../project/logout.php"><button id="btnlogout">Logout</button></a>
<h1 id="header">ONLINE VOTING SYSTEM</h1>
<hr>
<div id="profile">
	<img src="../project/upload <?php echo $userdata['photo']?>"height=100 width=100   alt=""><br><br>
	<strong>Name:</strong><?php echo $userdata['name']?><br><br>
	<strong>Mobile:</stromg><?php echo $userdata['mobile']?><br><br>
	<strong>Address:</strong><?php echo $userdata['address']?><br><br>
	<strong>Status:</strong><?php echo $staus?><br><br>

</div>
<div id="group">
	<?php
	if($_SESSION['candidatedata']){
		for($i=0;$i<count($candidatedata);$i++){
			?>
			<div>
				<img src="../project/upload<?php echo $candidatedata[$i]['photo']?>" height="100" width="100" alt=""><br><br>
				<strong>Candidate Name:</strong><?php echo $candidatedata[$i]['name']?><br><br>
				<strong>Votes:</strong><?php echo $candidatedata[$i]['votes']?>
				
				
			<form action="../project/vote.php" method="POST">
					<input type="hidden" name="gvotes" value="<?php echo $candidatedata[$i]['votes']?>">
					<input type="hidden" name="gid" value="<?php echo $candidatedata[$i]['id']?>">
					
					
				<?php
					if($_SESSION['userdata']['status']==0){
						?>
						<input type="submit" name="votebtn" value="vote" id="votebtn">
						<?php
					}
					else{
						?>
						<button disabled type="button" name="votebtn" value="vote" id="voted">Voted</button>
						<?php
					}
				?>
		        </form>
			</div>
			<?php
		}

	}
	else{
		

	}

	?>
</div>
</body>
</html>
