import { Box, Typography } from "@material-ui/core";
import React from "react";
import { TableComponent } from "../../components";

export const Books = () => {
  return (
    <Box>
      <Typography variant="h3">Books</Typography>
      <TableComponent />
    </Box>
  );
};
