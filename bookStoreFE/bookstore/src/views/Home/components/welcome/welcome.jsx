import React from "react";
import "./welcome_style.css";
import { Container, Box, Grid, Hidden, Typography } from '@material-ui/core';
function Welcome(props) {
  return (
    <>
    <Container>
    <Box>
        <Grid container justify="center">
          <Grid item sm={12} xs={12}>
            <Typography variant="h2">Добредојдовте во Book Store</Typography>
          </Grid>
          <Hidden xsDown>
            <Grid container item xs={12} justify="center">
              <Box component="span" alignItems="center" mt={5}>
                <Typography variant="body2" align="center">
                    Изнајмете и читајте книги од секој жанр. Дигитална библиотека богата со многу книги за секој.
                </Typography>
              </Box>
            </Grid>
          </Hidden>
          <Hidden smUp>
            <Grid container item xs={12}>
              <Box component="span" mt={1}>
                <Typography variant="body2">
                    Изнајмете и читајте книги од секој жанр. Дигитална библиотека богата со многу книги за секој.
                </Typography>
              </Box>
            </Grid>
          </Hidden>
        </Grid>
      </Box>
    </Container>
    </>
  );
}

export default Welcome;
