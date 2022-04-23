import React from "react";
import { makeStyles, createStyles, Box, Typography } from "@material-ui/core";
import { CardComponent } from "../../components";
import { cardData } from "./Home.data";

const useStyles = makeStyles(() =>
  createStyles({
    mainSection: {
      height: "30vh",
      width: "100%",
      backgroundColor: "#000000",
      display: "flex",
      justifyContent: "center",
      alignItems: "center",

      "& h3": {
        color: "#FFFFFF",
      },
    },
    booksContainer: {
      maxWidth: "60vw",
      margin: "0 auto",
      display: "flex",
      flexDirection: "row",
      flexWrap: "wrap",
      justifyContent: "space-around",
      marginTop: "40px",
    },
  })
);

export const Home = () => {
  const classes = useStyles();
  return (
    <Box>
      <Box className={classes.mainSection}>
        <Typography variant="h3">Homepage</Typography>
      </Box>
      <Box className={classes.booksContainer}>
        {cardData.map((book: any) => (
          <CardComponent
            title={book.title}
            content={book.content}
            image={book.image}
          />
        ))}
      </Box>
    </Box>
  );
};
