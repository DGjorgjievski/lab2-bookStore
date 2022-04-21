import React from 'react';
import { Card, Box, Typography, Hidden, Grid, CardMedia, makeStyles, Theme, createStyles, CardContent } from '@material-ui/core';
import { Card as MaterialCard } from '@material-ui/core';
import bookImg from './../../../../assets/images/Book.jpg';
const _Card = (props) => {
    return (
        <>
          <Card raised>
            <CardMedia>
              <MaterialCard url={bookImg}>
                <Grid container direction="column">
                  <Grid item xs>
                    <Box p={3} pt={2}>
                      <Typography component="div">
                        <Box fontWeight="fontWeightBold" color="white">
                          <Typography variant="h2">{props.title}</Typography>
                        </Box>
                      </Typography>
                    </Box>
                  </Grid>
                  <Grid container item xs direction="column" justify="flex-end">
                    <Box p={3}>
                      <Hidden mdDown>
                        {props.children}
                        <Box mt={3}>
                          <Box color="white" component="span">
                            <Typography variant="body2">Прикажи повеќе</Typography>
                          </Box>
                        </Box>
                      </Hidden>
                      <Hidden lgUp>
                        <Box color="white" component="span">
                          <Typography variant="body2">
                                Прикаќи повеќе
                          </Typography>
                        </Box>
                      </Hidden>
                    </Box>
                  </Grid>
                </Grid>
              </MaterialCard>
            </CardMedia>
          </Card>
        </>
      );
};

export default _Card;