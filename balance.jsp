<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Check Balance</title>
        <link rel="stylesheet" href="balance.css">
    </head>
    <body>
        <form method="post" action="balance">
             <div class="heading">
            <h1>Check your account balance</h1>
        </div>
        <div class="pic">
            <div class="lables">
                <div class="info"><pre>(1.)  Acc. No.  </pre>
                    <input type="number" name="acc" placeholder="Enter Account Number.">
                </div>
                <div class="info">
                    <pre>(2.)  User Name </pre>
                    <input type="text" name="name" placeholder="Enter Name.">
                </div>
                <div class="info">
                    <pre>(4.)  Enter Pin </pre>
                    <input type="password"  name="pin" placeholder="Enter Pin.">
                </div>
                <div id="dep_button">
                    <input type="submit" value="Cheack Balance" class="balance_button" >
                </div>
            </div>

        </div>
        </form>
    </body>
</html>