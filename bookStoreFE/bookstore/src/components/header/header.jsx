import React from "react";
import "./header_style.css";
import AppBar from "@material-ui/core/AppBar";
import Toolbar from "@material-ui/core/Toolbar";
import Box from '@mui/material/Box';
import Typography from "@material-ui/core/Typography";
import "./header_style.css";
import { Link } from "react-router-dom";

function Header(props) {
  return (
    <div className='header'>
      <AppBar position='static'>
        <Toolbar className='toolbar'>
          <Box mr={2}>
          <Link to='/' style={{ textDecoration: "none" }}>
            <Typography variant='h6'>
              Book Store Home
            </Typography>
          </Link>
          </Box>
          <Box mr={2}>
          <Link to='/About'>
            <Typography variant='h6'>
                About
              </Typography>
          </Link>
          </Box>
          <Box>
          <Link to='/Books'>
            <Typography variant='h6'>
                Books
              </Typography>
          </Link>
          </Box>
        </Toolbar>
      </AppBar>
    </div>
  );
}

export default Header;
