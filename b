// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.7.0 <0.9.0;

contract demo
{
    mapping (uint=>string) public roll_no;
    mapping(uint =>uint) public Daamarks;
    mapping(uint =>uint) public Osmarks;
    mapping(uint =>uint) public Dldmmarks;
    mapping(uint =>uint) public Bhrmarks;
    mapping(uint =>uint) public Ptrpmarks;
  // uint i=0;

   function student_information(uint keys,string memory value) public
    {
        roll_no[keys]=value;
    }
    function daa(uint key,uint _marks) public
    {
         Daamarks[key]=_marks;
    }
    function os(uint key,uint _marks) public
    {
         Osmarks[key]=_marks;
    }
    function Bhr(uint key,uint _marks) public
    {
         Bhrmarks[key]=_marks;
    }
    function Dldm(uint key,uint _marks) public
    {
         Dldmmarks[key]=_marks;
    }
    function Ptrp(uint key,uint _marks) public
    {
         Ptrpmarks[key]=_marks;
    }

}
