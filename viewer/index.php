<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="refresh" content="2" />
</head>
<body>

<?php
$txt1 = "Hallo Illya, Michael, Tim und Caro";

echo "<h2>" . $txt1 . "</h2>";

$ch = curl_init("http://temp-service:8080/environments");
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_HEADER, 0);
$data = curl_exec($ch);
curl_close($ch);

echo "<p>" . $data . "</p>";
?>

</body>
</html>