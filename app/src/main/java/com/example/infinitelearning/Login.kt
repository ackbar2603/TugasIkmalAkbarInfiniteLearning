package com.example.infinitelearning


import android.graphics.drawable.shapes.Shape
import android.icu.text.ListFormatter.Width
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(text = "Infinite Learning", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Image(painter = painterResource(id = R.drawable.ikmal), contentDescription = "Ikmal Akbar",
            modifier = Modifier.size(100.dp))

        Text(text = "Ikmal Akbar", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Hacker", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Login to gain access")
        
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label ={
            Text(text = "Email Adress")
        })

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label ={
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(24.dp))

        Button(shape = RoundedCornerShape(4.dp),
            modifier = Modifier.size(width = 280.dp, height = 45.dp),
            onClick = {
                Log.i("credential", "Email: $email Password: $password")
            }) {
            Text(text = "Submit")
        }

    }
}