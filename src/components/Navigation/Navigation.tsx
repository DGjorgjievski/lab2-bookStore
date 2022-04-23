import React from "react";
import {
  makeStyles,
  createStyles,
  Box,
  Typography,
  Link,
} from "@material-ui/core";

const useStyles = makeStyles(() =>
  createStyles({
    menuContainer: {
      height: "100px",
      maxWidth: "600px",
      margin: "0 auto",
      display: "flex",
      flexDirection: "row",
      justifyContent: "space-around",
      alignItems: "center",

      "& a": {
        color: "grey",
      },
    },
  })
);

export const Navigation = () => {
  const classes = useStyles();
  return (
    <Box className={classes.menuContainer}>
      <Link href="/">
        <Typography variant="h5" component="span">
          Home
        </Typography>
      </Link>
      <Link href="/about">
        <Typography variant="h5">About</Typography>
      </Link>
      <Link href="/books">
        <Typography variant="h5">Books</Typography>
      </Link>
    </Box>
  );
};
