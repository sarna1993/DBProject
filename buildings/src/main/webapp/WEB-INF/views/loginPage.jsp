<!DOCTYPE html>
<html>
<style>
    /*background*/
    body {                                                              
        position: relative;
        background-image: url(https://images3.alphacoders.com/707/707476.jpg);
        /* background-image: url(http://www.intrawallpaper.com/static/images/New-York-City-Desktop-Wallpaper.jpg); */
        background-repeat:no-repeat;
        background-size:100% 100vh;
        margin : 0;
    }
        
    /*naglowek*/
    h1 {
        text-align: center;
        color: white;
        font-family: verdana;
        font-weight: bold;
        font-size: 40px;
        letter-spacing: 3px;
    }    
    
    /*logo*/
    .imgcontainer { 
        text-align: center;
        margin: 36px 0 18px 0;
        position: relative;
    }
    img.avatar {                                  
        width: 10%;
        border-radius: 10%;
    }
       
    /*okno logowania*/
    .container {                                
        padding: 16px;
        width: 30%;
        position: absolute;
        margin-left: auto;
        margin-right: auto;
        left: 0;
        right: 0;
        color: white;
    }
    
    /*button*/
    button {
        background-color: #7f5dff;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }
    
    /* Czerwone zaznaczenie */
    .modal-content {
        background-color: #fefefe;
    }
    
    /* Input window */
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }



    

 </style>

 
        <br><br><br><h1>LOGOWANIE</h1>

        <div class="imgcontainer">   
            <img src="http://www.whs.school.nz/wp-content/themes/whs-theme-v2/images/login-hub/google-classroom-logo.png" alt="Avatar" class="avatar">
        </div>
        

        <form class="modal-content" >
        <div class="container">
            <label><b>LOGIN</b></label>
            <input type="text" placeholder="Podaj login" name="uname" required>

            <label><b>HASLO</b></label>
            <input type="password" placeholder="Podaj haslo" name="psw" required>


            <button type="submit">Loguj</button>

        </div>
        </form>
 




    </body>
</html>
