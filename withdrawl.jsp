<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Withdraw</title>
        <link rel="stylesheet" href="with.css">
    </head>
    <body>
        <form method="post" action="withdrawl">
            <div class="top">
                <p> Withdraw Your Amount</p>
            </div>

            <div class="back">
                <div class="lables">
                    <div class="info">
                        <pre>(1.) Enter Amount   </pre>
                        <input type="number" name="amount" placeholder="Enter Amount">
                    </div>


                    <div class="info">
                        <pre>(2.) Enter Pin      </pre>
                        <input type="password" name="pin" placeholder="Enter Pin">
                    </div>

                    <input type="submit" value="Withdraw" class="Withdraw">
                </div>

                <div class="pic">
                    <img src="images/Money.webp"  style="width:100%;height: 100%;position: relative; border-radius: 30px;">
                </div>
            </div>
        </form>
    </body>
</html>