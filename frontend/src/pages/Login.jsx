import React from 'react'
import TextBox from '../components/TextBox'

const Login = () => {
  return (
   <>
   <div className="Login_container">

     <h2>Login page</h2>
     <TextBox labelName="username" boxType="text"/>
   
     <TextBox labelName="password" boxType="password"/>
  
     <button>Login</button>
   </div>
   </>
  )
}

export default Login