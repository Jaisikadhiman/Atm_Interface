<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Deposite_Details</title>
        <link rel="stylesheet" href="dep.css">
    </head>
    <body>
        <form method="post" action="deposite">
            <div class="heading">
                <h1>Enter Your Details For Deposite</h1>
            </div>
           <div class="pic">

               <d class="lables" style="margin: 20px;">
                    <div class="info"><pre>(1.)  Acc. No.  </pre>
                        <input type="number" style="margin-bottom: 20px;" name="acc" placeholder="Enter Account Number.">
                    </div>
                    <div class="info">
                        <pre>(2.)  Name      </pre>
                        <input type="text" style="margin-bottom: 20px;" name="name" placeholder="Enter Name.">
                    </div>

                    <div class="info">
                        <pre>(4.)  Amount    </pre>
                        <input type="number" style="margin-bottom: 20px;" name="amount" placeholder="Enter Amount.">
                    </div>
                    <div id="dep_button">
                        <input type="submit"value="Deposite" style="height: 40px ; width: 150px; background-color: rgb(24, 57, 117); color: bisque; margin-left: 230px; margin-top: 30px; border: 2px solid bisque;" >
                    </div>
                </div>
                
            </div>
        </form>
    </body>
</html>