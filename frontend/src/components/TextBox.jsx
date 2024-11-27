import React from 'react'

const TextBox = (props) => {
    const labelName=props.labelName;
    const boxType=props.boxType;
  return (
    <>
    <div className='TextBox_label'>{labelName}</div>
    <input className='TextBox_input' type={boxType} placeholder={"enter "+labelName} ></input>
    </>
  )
}

export default TextBox