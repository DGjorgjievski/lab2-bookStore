import React, { Component } from "react";
import PropTypes from "prop-types";
import { Container, Box, Grid, Hidden } from '@material-ui/core';
import Welcome from "./components/welcome/welcome";
import Books  from "./components/bookCards/bookCards";
export default class Home extends Component {
  render() {
    return (
      <>
      <Container>
        <Box mt={5}>
          <Welcome />
        </Box>
        <Box mt={5}>
          <Books />
        </Box>
      </Container>
    </>
    );
  }
}
Home.propTypes = {
  messsage: PropTypes.string
};
