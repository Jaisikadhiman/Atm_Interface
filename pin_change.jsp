<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Pin_Change </title>
        <link rel="stylesheet" href="pin.css">
    </head>
    <body>
        <form method="post" action="pin">
            <div class="top">
            <p>Change your pin</p>
        </div>

        <div class="back">
            <div class="lables">
                <div class="info">
                    <pre>(1.) Enter Old Pin      </pre>
                    <input type="number" name="old" placeholder="Enter Old Pin">
                </div>

                <div class="info">
                    <pre>(2.) Enter New Pin      </pre>
                    <input type="password" name="new" placeholder="Enter New Pin">
                </div>

                <div class="info">
                    <pre>(3.) Confirm Pin        </pre>
                    <input type="password" name="confirm" placeholder="Check Pin">
                </div>

                <input type="submit" value="Change" class="Changes">
            </div>
             
            <div class="pic" style="height: 400px; border:2px black solid; border-radius: 20px;">
                 <img style="height:100%;width:100%;border-radius:20px;"src="images/pin.jpg" alt="not uploaded">
            </div>
        </div>
       </form>
    </body>
</html>