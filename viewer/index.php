<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="refresh" content="2" />
</head>
<body>

<h1>ITS-Projekt SS19 - Sensorwerte:</h1>

<p>
<?php

$rq = curl_init("http://temp-service:8080/environments");
curl_setopt($rq, CURLOPT_RETURNTRANSFER, true);
curl_setopt($rq, CURLOPT_HEADER, 0);
$rawData = curl_exec($rq);
curl_close($rq);

$data = json_decode($rawData);

echo  "Temperatur: " . $data->{'temperature'} . " °C<br />";
echo  "Druck: " . $data->{'pressure'} . " hPa<br />";
echo  "Feuchtigkeit: " . $data->{'humidity'} . " %<br />";
?>
</p>

</body>
</html>