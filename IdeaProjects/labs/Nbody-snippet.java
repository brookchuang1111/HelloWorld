
The following is a hint at what you will need to compute forces.

        // I am only showing code for X direction.  Similar for Y.  That is,
        // define fy[].

        // pairwiseForcesX[i][j] is the force exerted on object i due to object j.
	// r[i][j] is distance between objects i and j.
        double pairwiseForces[][], r[][];
        // fx[i] is the total force on object i
        double fx[];
        pairwiseForces = new double[N][o];
        r = new double[N][];
        for (int i = 0; i < N; i++) {
            pairwiseForces[i] = new double[N];
            r[i] = new double[N];
        }

	while (true) {
	  ...
          for (int i = 0; i < N; i++)
        	for (int j = 0; j < N; j++) {
                  if (i == j)
                    continue;
                  r[i][j] = Math.sqrt((px[i] - px[j]) * (px[i] - px[j]) + (py[i] - py[j]) * (py[i] - py[j]));
                  // Compute the magnitude of force between i and j
                  pairwiseForces[i][j] = (G * mass[i] * mass[j]) / (r[i][j] * r[i][j]) ;
            }

       	  for (int i = 0; i < N; i++) {
            fx[i] = 0.0;
            for (int j = 0; j < N; j++) {
                // Compute F cos theta.
		// NOTE: to get the direction right, we compute px[j] - px[i]
		// This computes the force exerted by object J on object I.
		// Similarly for y direction.
                fx[i] += pairwiseForces[i][j] * ((px[j] - px[i]) / r[i][j];
            }
          }
	}
