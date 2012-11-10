package resources;

import static resources.AminoAcids.REVERSE;

public class Matrix {
	/*
	 * remember that most matrices are not completely full. Remember to
	 */
	public static final double[][] blosum50 = {
			{ 9 },
			{ 0, 14 },
			{ 0, 1, 11 },
			{ 0, -2, 5, 17 },
			{ -5, -16, -13, -13, 39 },
			{ 1, 7, 1, 1, -14, 13 },
			{ 0, 3, 1, 5, -20, 5, 12 },
			{ 1, -2, 1, 2, -15, -3, 0, 16 },
			{ -2, 2, 5, 1, -18, 2, 0, -2, 23 },
			{ 0, -7, -8, -9, -3, -7, -8, -3, -4, 10 },
			{ -2, -4, -7, -10, -11, -10, -8, -6, -4, 7, 10 },
			{ 0, 7, 2, 0, -23, 4, 6, 0, 1, -7, -4, 9 },
			{ -2, -8, -6, -7, -9, -8, -6, -7, -5, 10, 11, -4, 13 },
			{ -1, -6, -3, -6, -12, -4, -10, -8, -1, 3, 3, -8, 0, 16 },
			{ -1, -3, -1, 2, -18, -4, -1, 0, -4, -3, 1, 1, -4, -4, 19 },
			{ 0, 2, 3, 0, -18, 0, 0, 0, 0, -6, -4, 1, -7, -4, 1, 9 },
			{ -3, 0, 2, 0, -19, 2, 3, -4, 0, -3, -5, 1, -3, -2, -1, 5, 7 },
			{ -11, -6, -9, -7, -24, -12, -3, -10, -9, -6, 2, -7, -4, 9, -5, -7,
					0, 32 },
			{ -3, -1, 1, -6, -1, -5, -5, -10, 1, -2, -4, -5, -3, 8, -8, -1, 3,
					0, 19 },
			{ 0, -4, -4, -10, 0, -2, -6, -5, -6, 8, 6, -6, 6, 1, -4, -5, -1,
					-5, -1, 9 } };

	public static final double[][] threader = {
			{ 10.0, -0.2, -1.2, -2.8, 3.8, 0.6, -1.0, 0.9, 0.2, 5.1, 4.5, -1.4,
					3.9, 1.9, -0.9, 1.8, 1.6, 0.5, 1.8, 5.5 },
			{ 2.3, 8.1, -0.4, -1.6, -0.6, 2.9, 1.0, -1.9, 1.8, 0.5, 1.8, 3.6,
					1.7, 0.4, -2.1, 0.2, 0.7, -0.5, 1.7, 1.0 },
			{ 1.5, 0.3, 6.4, 1.9, -0.3, 1.2, 0.6, 0.5, 2.0, -0.4, -1.1, 0.5,
					0.2, -1.9, -1.3, 1.6, 1.0, -2.4, -0.4, -0.6 },
			{ 0.7, -0.4, 2.2, 7.3, -2.3, 1.5, 2.7, -0.4, 0.2, -1.6, -1.3, -0.1,
					-1.7, -3.0, -0.4, 0.9, 0.2, -3.4, -1.4, -1.8 },
			{ 2.7, -3.0, -2.4, -4.9, 16.3, -2.4, -4.1, -1.6, -0.9, 4.0, 3.7,
					-4.2, 2.2, 2.7, -3.6, -0.4, 0.5, -1.2, 1.0, 4.6 },
			{ 3.5, 3.2, 0.8, 0.6, 0.0, 8.4, 3.3, -1.0, 2.7, 1.2, 2.6, 3.1, 3.4,
					-0.6, -0.2, 1.3, 0.8, 1.2, 1.6, 0.7 },
			{ 3.0, 2.2, 0.8, 2.4, -0.6, 4.1, 7.0, -1.9, 1.6, -0.3, 1.0, 2.3,
					1.1, -0.4, -0.2, 0.4, 0.7, -1.0, 0.2, 0.2 },
			{ 2.0, -2.2, -0.1, -1.3, -1.0, -1.3, -3.0, 7.8, -0.9, -1.2, -1.4,
					-2.2, -0.9, -1.9, -1.5, 0.6, -0.9, -1.7, -1.3, -1.3 },
			{ 1.4, 1.1, 0.8, -1.4, 0.4, 1.8, -0.2, -1.0, 9.9, 0.5, 1.4, -0.2,
					2.1, 2.0, -1.6, -0.2, -0.4, -0.6, 4.1, 0.3 },
			{ 4.1, -2.9, -3.8, -5.9, 4.8, -2.4, -5.7, -2.5, -1.2, 13.2, 9.8,
					-4.7, 7.4, 6.3, -3.1, -2.2, 1.1, 1.6, 4.0, 11.8 },
			{ 3.6, -1.4, -4.3, -5.4, 4.2, -0.8, -3.9, -2.7, -0.4, 9.7, 12.5,
					-3.9, 8.3, 6.8, -3.8, -2.1, 0.9, 2.3, 3.8, 8.2 },
			{ 2.7, 4.6, 0.8, -0.3, -0.7, 3.9, 2.4, -1.0, 1.6, 0.4, 0.8, 6.5,
					1.0, -1.3, -0.2, 1.2, 0.6, -1.1, 0.2, 0.0 },
			{ 4.3, -0.4, -2.2, -4.9, 3.6, 1.2, -2.5, -1.7, 1.3, 8.7, 9.7, -2.5,
					11.4, 5.2, -2.8, -1.0, 0.9, 2.7, 4.1, 7.2 },
			{ 1.8, -2.0, -4.4, -6.3, 3.8, -3.1, -4.3, -2.6, 1.1, 7.0, 7.6,
					-5.1, 4.8, 12.4, -3.8, -2.2, -0.1, 4.4, 7.6, 5.8 },
			{ 0.3, -2.1, -1.5, -0.8, -2.9, -0.4, -0.7, -1.2, -1.1, -1.5, -2.4,
					-0.9, -1.7, -2.7, 8.7, -0.4, -0.2, -3.1, -1.9, -1.5 },
			{ 3.5, 0.0, 0.9, -0.3, 1.3, 0.9, -0.8, 0.6, 0.3, 0.4, 0.4, -0.1,
					0.6, -0.4, -0.6, 4.9, 2.8, -2.0, 0.1, 1.1 },
			{ 2.9, 0.1, -0.1, -1.4, 2.1, -0.0, -1.1, -1.0, -0.3, 3.2, 2.9,
					-1.1, 2.0, 1.1, -0.6, 2.4, 5.8, -0.7, 0.7, 3.9 },
			{ 1.5, -1.8, -4.2, -5.9, 0.6, -0.3, -3.8, -2.0, -0.7, 3.5, 4.3,
					-3.9, 3.5, 5.5, -3.7, -3.0, -1.2, 16.0, 5.4, 3.1 },
			{ 2.2, -0.1, -2.5, -4.2, 2.4, -0.4, -3.1, -1.9, 3.6, 5.4, 5.1,
					-3.0, 4.3, 8.2, -2.9, -1.3, -0.2, 4.9, 10.8, 5.1 },
			{ 4.6, -2.2, -3.8, -5.9, 5.4, -2.6, -4.9, -2.5, -1.4, 11.9, 8.4,
					-4.8, 6.1, 5.1, -3.0, -1.4, 2.0, 1.3, 3.8, 12.7 } };

	public static final double[][] blakeCohen = {
			{ 9 },
			{ 0, 14 },
			{ 0, 1, 11 },
			{ 0, -2, 5, 17 },
			{ -5, -16, -13, -13, 39 },
			{ 1, 7, 1, 1, -14, 13 },
			{ 0, 3, 1, 5, -20, 5, 12 },
			{ 1, -2, 1, 2, -15, -3, 0, 16 },
			{ -2, 2, 5, 1, -18, 2, 0, -2, 23 },
			{ 0, -7, -8, -9, -3, -7, -8, -3, -4, 10 },
			{ -2, -4, -7, -10, -11, -10, -8, -6, -4, 7, 10 },
			{ 0, 7, 2, 0, -23, 4, 6, 0, 1, -7, -4, 9 },
			{ -2, -8, -6, -7, -9, -8, -6, -7, -5, 10, 11, -4, 13 },
			{ -1, -6, -3, -6, -12, -4, -10, -8, -1, 3, 3, -8, 0, 16 },
			{ -1, -3, -1, 2, -18, -4, -1, 0, -4, -3, 1, 1, -4, -4, 19 },
			{ 0, 2, 3, 0, -18, 0, 0, 0, 0, -6, -4, 1, -7, -4, 1, 9 },
			{ -3, 0, 2, 0, -19, 2, 3, -4, 0, -3, -5, 1, -3, -2, -1, 5, 7 },
			{ -11, -6, -9, -7, -24, -12, -3, -10, -9, -6, 2, -7, -4, 9, -5, -7,
					0, 32 },
			{ -3, -1, 1, -6, -1, -5, -5, -10, 1, -2, -4, -5, -3, 8, -8, -1, 3,
					0, 19 },
			{ 0, -4, -4, -10, 0, -2, -6, -5, -6, 8, 6, -6, 6, 1, -4, -5, -1,
					-5, -1, 9 } };

	public static final double[][] dayhoff = {
			{ 1.8 },
			{ -1.6, 6.1 },
			{ 0.2, 0.0, 2.0 },
			{ 0.3, -1.3, 2.1, 3.9 },
			{ -2.0, -3.6, -3.6, -5.1, 12.0 },
			{ -0.4, 1.2, 0.80, 1.60, -5.30, 4.10 },
			{ 0.3, -1.1, 1.40, 3.40, -5.30, 2.50, 3.90 },
			{ 1.3, -2.6, 0.40, 0.60, -3.30, -1.20, 0.20, 4.80 },
			{ -1.4, 1.5, 1.60, 0.70, -3.40, 2.90, 0.60, -2.10, 6.60 },
			{ -0.5, -2.0, -1.80, -2.40, -2.30, -2.00, -2.00, -2.60, -2.50, 4.6 },
			{ -1.9, -3.0, -2.90, -4.00, -6.00, -1.80, -3.30, -4.00, -2.10, 2.4,
					6.00 },
			{ -1.2, 3.4, 1.00, 0.10, -5.40, 0.70, -0.10, -1.70, -0.10, -1.90,
					-2.9, 4.70 },
			{ -1.2, -0.5, -1.80, -2.60, -5.20, -1.00, -2.20, -2.80, -2.20, 2.2,
					3.70, 0.40, 6.60 },
			{ -3.5, -4.5, -3.50, -5.60, -4.30, -4.70, -5.40, -4.80, -1.80, 1.0,
					1.80, -5.30, 0.20, 9.10 },
			{ 1.1, -0.2, -0.50, -1.00, -2.70, 0.20, -0.60, -0.50, -0.30, -2.0,
					-2.60, -1.20, -2.10, -4.60, 5.90 },
			{ 1.1, -0.3, 0.70, 0.30, -0.00, -0.50, -0.00, 1.10, -0.80, -1.40,
					-2.8, -0.20, -1.60, -3.20, 0.90, 1.60 },
			{ 1.2, -0.9, 0.40, -0.10, -2.20, -0.80, -0.40, -0.00, -1.30, 0.1,
					-1.70, -0.00, -0.60, -3.10, 0.30, 1.30, 2.60 },
			{ -5.6, 2.3, -3.90, -6.60, -7.50, -4.60, -6.80, -6.80, -2.50, -5.0,
					-1.70, -3.30, -4.10, 0.50, -5.50, -2.30, -5.00, 17.3 },
			{ -3.5, -4.2, -2.10, -4.30, 0.40, -4.00, -4.30, -5.30, -0.10, -1.0,
					-0.90, -4.50, -2.50, 7.00, -5.00, -2.80, -2.80, 0.0, 10.20 },
			{ 0.2, -2.5, -1.80, -2.20, -1.90, -1.90, -1.80, -1.40, -2.30, 3.7,
					1.80, -2.50, 1.80, -1.20, -1.20, -1.00, 0.30, -6.10, -2.5,
					4.30 } };

	public static final double[][] pam250 = {
			{ 2 },
			{ -2, 6 },
			{ 0, 0, 2 },
			{ 0, -1, 2, 4 },
			{ -2, -4, -4, -5, 12 },
			{ 0, 1, 1, 2, -5, 4 },
			{ 0, -1, 1, 3, -5, 2, 4 },
			{ 1, -3, 0, 1, -3, -1, 0, 5 },
			{ -1, 2, 2, 1, -3, 3, 1, -2, 6 },
			{ -1, -2, -2, -2, -2, -2, -2, -3, -2, 5 },
			{ -2, -3, -3, -4, -6, -2, -3, -4, -2, 2, 6 },
			{ -1, 3, 1, 0, -5, 1, 0, -2, 0, -2, -3, 5 },
			{ -1, 0, -2, -3, -5, -1, -2, -3, -2, 2, 4, 0, 6 },
			{ -4, -4, -4, -6, -4, -5, -5, -5, -2, 1, 2, -5, 0, 9 },
			{ 1, 0, -1, -1, -3, 0, -1, -1, 0, -2, -3, -1, -2, -5, 6 },
			{ 1, 0, 1, 0, 0, -1, 0, 1, -1, -1, -3, 0, -2, -3, 1, 2 },
			{ 1, -1, 0, 0, -2, -1, 0, 0, -1, 0, -2, 0, -1, -3, 0, 1, 3 },
			{ -6, 2, -4, -7, -8, -5, -7, -7, -3, -5, -2, -3, -4, 0, -6, -2, -5,
					17 },
			{ -3, -4, -2, -4, 0, -4, -4, -5, 0, -1, -1, -4, -2, 7, -5, -3, -3,
					0, 10 },
			{ 0, -2, -2, -2, -2, -2, -2, -1, -2, 4, 2, -2, 2, -1, -1, -1, 0,
					-6, -2, 4 } };

	// of the form pss[aminoAcid][seqStruct]
	public static final int[][] pss = {
			{ -35, 31, 9, -33, 0, 67, 7, -2, -12, -26, -24, 23, 65, -23, -18,
					20, 31, 13, -8, 4, 0 },
			{ 27, -24, 63, 31, -33, 42, 0, -52, 21, -14, -5, 44, 77, 21, 8, 15,
					-21, -59, -27, -37, 0 },
			{ 21, -5, -27, 17, 24, -44, -5, 49, 0, 37, 27, -29, -49, 9, 11,
					-19, -6, 41, 26, 22, 0 } };

//	// of the form ccpa[contact][aminoAcid]
//	public static final int[][] ccpa = {
//			{ -20, 4, -8, -65, -91, -97, -96, -96, -96, -96, -96, -96, -96, -96 },
//			{ 198, 91, 27, -25, -70, -53, -92, -72, -82, -77, -79, -78, -79,
//					-78 },
//			{ -44, 13, 50, 84, 97, 63, 101, 82, 91, 86, 89, 87, 88, 88 },
//			{ -89, -43, 13, 39, 90, 108, 144, 126, 135, 130, 132, 131, 132, 131 },
//			{ 67, -13, -44, -23, 12, 21, 52, 36, 44, 40, 42, 41, 41, 41 },
//			{ 82, 109, 87, 51, 6, 0, -20, -10, -15, -12, -13, -13, -13, -13 },
//			{ 12, -5, -13, 21, 29, 74, 29, 51, 40, 45, 43, 44, 43, 44 },
//			{ 78, 5, -34, -40, -32, -35, -30, -32, -31, -31, -31, -31, -31, -31 },
//			{ -56, -45, 16, 77, 158, 222, 320, 271, 295, 283, 289, 286, 287,
//					287 },
//			{ 40, -36, -65, -48, -36, -5, -8, -6, -7, -6, -7, -6, -7, -6 },
//			{ 26, -26, -61, -40, -35, -22, -13, -17, -15, -16, -15, -16, -15,
//					-16 },
//			{ -4, 30, 31, 50, 51, 46, 20, 33, 26, 29, 28, 28, 28, 28 },
//			{ 44, 88, 87, 74, 58, 18, 67, 42, 54, 48, 51, 50, 50, 50 },
//			{ -56, -52, 1, 39, 55, 112, 113, 112, 112, 112, 112, 112, 112, 112 },
//			{ -38, -54, -13, 31, 80, 149, 159, 154, 156, 155, 155, 155, 155,
//					155 },
//			{ -4, 37, 53, 28, 15, 0, -25, -12, -18, -15, -17, -16, -16, -16 },
//			{ 25, 42, 46, 24, 21, 0, -4, -2, -3, -2, -2, -2, -2, -2 },
//			{ 93, 42, 1, -30, -38, -62, -56, -59, -57, -58, -57, -58, -57, -58 },
//			{ 45, -26, -40, -33, 14, 22, 74, 48, 61, 54, 57, 56, 56, 56 },
//			{ 58, -3, -35, -13, 4, 42, 66, 54, 60, 57, 58, 57, 58, 57 },
//			{ 22, 7, 4, 10, 19, 30, 40, 35, 37, 36, 36, 36, 36, 36 } };
//
//	// of the form ccpa[contact][aminoAcid]
//	public static final int[][] ccpb = {
//			{ 31, 81, 59, 46, 20, -7, -26, -26, -26, -26, -26, -26, -26, -26 },
//			{ 124, 141, 50, 3, -43,
//					-71 - 101 - 143 - 122 - 132 - 127 - 129 - 128 - 129 },
//			{ -9, 0, 30, 76, 92, 124, 137, 136, 136, 136, 136, 136, 136, 136 },
//			{ -25, -42, -12, 32, 88, 114, 165, 208, 186, 197, 191, 194, 193,
//					193 },
//			{ 49, 13, -23, -43, -57, -37, -30, 10, -10, 0, -5, -2, -3, -3 },
//			{ -38, 56, 102, 69, 36, 4, 1, -3, -1, -2, -1, -1, -1, -1 },
//			{ 13, -16, -15, -7, 2, 14, 58, 61, 59, 60, 59, 60, 59, 60 },
//			{ 54, 19, -34, -55, -70, -68, -79, -71, -75, -73, -74, -73, -73,
//					-73 },
//			{ -48, -51, -18, 14, 69, 127, 228, 365, 296, 330, 313, 322, 317,
//					320 },
//			{ 63, 60, -1, -33, -29, -23, -10, -19, -14, -16, -15, -16, -15, -16 },
//			{ 43, 20, -4, -12, -18, -12, 24, 54, 39, 46, 42, 44, 43, 44 },
//			{ -3, 0, 27, 52, 67, 78, 52, 87, 69, 78, 73, 76, 74, 75 },
//			{ 18, 14, 44, 93, 109, 124, 119, 204, 161, 182, 172, 177, 174, 176 },
//			{ -53, -28, -7, 19, 49, 80, 102, 100, 101, 100, 100, 100, 100, 100 },
//			{ -19, -35, -20, -9, 25, 80, 192, 183, 187, 185, 186, 185, 186, 185 },
//			{ -31, -17, 16, 23, 27, 23, 37, -10, 13, 1, 7, 4, 6, 5 },
//			{ -12, -53, -55, -20, 1, 15, 16, -15, 0, -7, -3, -5, -4, -4 },
//			{ 14, 8, -28, -48, -70,
//					-93 - 116 - 106 - 111 - 108 - 109 - 109 - 109 - 109 },
//			{ 90, 19, -24, -35, -54, -31, 0, 68, 34, 51, 42, 46, 44, 45 },
//			{ 63, -7, -12, -55, -51, -49, -21, -23, -22, -22, -22, -22, -22,
//					-22 },
//			{ 16, 9, 3, 5, 9, 19, 37, 53, 45, 49, 47, 48, 47, 47 } };
//
//	// of the form ccpa[contact][aminoAcid]
//	public static final int[][] ccpo = {
//			{ 31, 46, 28, 13, -13, -13, -3, -44, -23, -33, -28, -31, -29, -30 },
//			{ 157, 59, -15, -52, -80, -79,
//					-93 - 141 - 117 - 129 - 123 - 126 - 124 - 125 },
//			{ -59, -31, -27, 0, 26, 40, 32, 12, 22, 17, 19, 18, 18, 18 },
//			{ -18, -5, 29, 56, 100, 114, 136, 209, 172, 190, 181, 186, 183, 185 },
//			{ 89, 38, 4, -19, -15, 17, 36, 83, 59, 71, 65, 68, 66, 67 },
//			{ -63, -32, -14, -26, -45, -72, -67, -76, -71, -73, -72, -73, -72,
//					-73 },
//			{ 0, -8, -18, -8, -3, 16, 37, 40, 38, 39, 38, 39, 38, 39 },
//			{ 128, 71, 26, 16, 6, 10, -4, -4, -4, -4, -4, -4, -4, -4 },
//			{ -26, -33, 0, 32, 91, 145, 189, 246, 217, 231, 224, 228, 226, 227 },
//			{ 101, 45, 14, 2, 9, 21, 10, 37, 23, 30, 26, 28, 27, 28 },
//			{ 63, 26, 10, 16, -1, 14, 16, 102, 59, 80, 69, 75, 72, 73 },
//			{ -46, -37, -28, -12, -1, 0, -14, 4, -5, 0, -2, -1, -2, -1 },
//			{ -49, -50, -41, -50, -55, -61, -59, -36, -47, -41, -44, -43, -43,
//					-43 },
//			{ -13, -7, 11, 34, 50, 80, 92, 160, 126, 143, 134, 138, 136, 137 },
//			{ 9, -15, 0, 26, 43, 62, 107, 74, 90, 82, 86, 84, 85, 84 },
//			{ -36, -20, -7, -1, -6, -17, -21, -23, -22, -22, -22, -22, -22, -22 },
//			{ -9, -8, -7, 0, 1, -12, -15, 7, -4, 1, -1, 0, 0, 0 },
//			{ 115, 73, 32, 6, -2, -19, -28, -43, -35, -39, -37, -38, -37, -38 },
//			{ 108, 38, 6, -23, -6, 6, 7, 69, 38, 53, 45, 49, 47, 48 },
//			{ 86, 22, -2, -9, -6, 25, 15, 61, 38, 49, 43, 46, 45, 45 },
//			{ 28, 8, 0, 0, 4, 13, 18, 36, 27, 32, 30, 31, 30, 30 } };

	// format: ccp[secondary][contact][aminoacid]
	public static int[][][] ccp = {
			{
					{ -20, 4, -8, -65, -91, -97, -96, -96, -96, -96, -96, -96,
							-96, -96 },
					{ 198, 91, 27, -25, -70, -53, -92, -72, -82, -77, -79, -78,
							-79, -78 },
					{ -44, 13, 50, 84, 97, 63, 101, 82, 91, 86, 89, 87, 88, 88 },
					{ -89, -43, 13, 39, 90, 108, 144, 126, 135, 130, 132, 131,
							132, 131 },
					{ 67, -13, -44, -23, 12, 21, 52, 36, 44, 40, 42, 41, 41, 41 },
					{ 82, 109, 87, 51, 6, 0, -20, -10, -15, -12, -13, -13, -13,
							-13 },
					{ 12, -5, -13, 21, 29, 74, 29, 51, 40, 45, 43, 44, 43, 44 },
					{ 78, 5, -34, -40, -32, -35, -30, -32, -31, -31, -31, -31,
							-31, -31 },
					{ -56, -45, 16, 77, 158, 222, 320, 271, 295, 283, 289, 286,
							287, 287 },
					{ 40, -36, -65, -48, -36, -5, -8, -6, -7, -6, -7, -6, -7,
							-6 },
					{ 26, -26, -61, -40, -35, -22, -13, -17, -15, -16, -15,
							-16, -15, -16 },
					{ -4, 30, 31, 50, 51, 46, 20, 33, 26, 29, 28, 28, 28, 28 },
					{ 44, 88, 87, 74, 58, 18, 67, 42, 54, 48, 51, 50, 50, 50 },
					{ -56, -52, 1, 39, 55, 112, 113, 112, 112, 112, 112, 112,
							112, 112 },
					{ -38, -54, -13, 31, 80, 149, 159, 154, 156, 155, 155, 155,
							155, 155 },
					{ -4, 37, 53, 28, 15, 0, -25, -12, -18, -15, -17, -16, -16,
							-16 },
					{ 25, 42, 46, 24, 21, 0, -4, -2, -3, -2, -2, -2, -2, -2 },
					{ 93, 42, 1, -30, -38, -62, -56, -59, -57, -58, -57, -58,
							-57, -58 },
					{ 45, -26, -40, -33, 14, 22, 74, 48, 61, 54, 57, 56, 56, 56 },
					{ 58, -3, -35, -13, 4, 42, 66, 54, 60, 57, 58, 57, 58, 57 },
					{ 22, 7, 4, 10, 19, 30, 40, 35, 37, 36, 36, 36, 36, 36 } },
			{
					{ 31, 81, 59, 46, 20, -7, -26, -26, -26, -26, -26, -26,
							-26, -26 },
					{ 124, 141, 50, 3, -43,
							-71 - 101 - 143 - 122 - 132 - 127 - 129 - 128 - 129 },
					{ -9, 0, 30, 76, 92, 124, 137, 136, 136, 136, 136, 136,
							136, 136 },
					{ -25, -42, -12, 32, 88, 114, 165, 208, 186, 197, 191, 194,
							193, 193 },
					{ 49, 13, -23, -43, -57, -37, -30, 10, -10, 0, -5, -2, -3,
							-3 },
					{ -38, 56, 102, 69, 36, 4, 1, -3, -1, -2, -1, -1, -1, -1 },
					{ 13, -16, -15, -7, 2, 14, 58, 61, 59, 60, 59, 60, 59, 60 },
					{ 54, 19, -34, -55, -70, -68, -79, -71, -75, -73, -74, -73,
							-73, -73 },
					{ -48, -51, -18, 14, 69, 127, 228, 365, 296, 330, 313, 322,
							317, 320 },
					{ 63, 60, -1, -33, -29, -23, -10, -19, -14, -16, -15, -16,
							-15, -16 },
					{ 43, 20, -4, -12, -18, -12, 24, 54, 39, 46, 42, 44, 43, 44 },
					{ -3, 0, 27, 52, 67, 78, 52, 87, 69, 78, 73, 76, 74, 75 },
					{ 18, 14, 44, 93, 109, 124, 119, 204, 161, 182, 172, 177,
							174, 176 },
					{ -53, -28, -7, 19, 49, 80, 102, 100, 101, 100, 100, 100,
							100, 100 },
					{ -19, -35, -20, -9, 25, 80, 192, 183, 187, 185, 186, 185,
							186, 185 },
					{ -31, -17, 16, 23, 27, 23, 37, -10, 13, 1, 7, 4, 6, 5 },
					{ -12, -53, -55, -20, 1, 15, 16, -15, 0, -7, -3, -5, -4, -4 },
					{ 14, 8, -28, -48, -70,
							-93 - 116 - 106 - 111 - 108 - 109 - 109 - 109 - 109 },
					{ 90, 19, -24, -35, -54, -31, 0, 68, 34, 51, 42, 46, 44, 45 },
					{ 63, -7, -12, -55, -51, -49, -21, -23, -22, -22, -22, -22,
							-22, -22 },
					{ 16, 9, 3, 5, 9, 19, 37, 53, 45, 49, 47, 48, 47, 47 } },
			{
					{ 31, 46, 28, 13, -13, -13, -3, -44, -23, -33, -28, -31,
							-29, -30 },
					{ 157, 59, -15, -52, -80, -79,
							-93 - 141 - 117 - 129 - 123 - 126 - 124 - 125 },
					{ -59, -31, -27, 0, 26, 40, 32, 12, 22, 17, 19, 18, 18, 18 },
					{ -18, -5, 29, 56, 100, 114, 136, 209, 172, 190, 181, 186,
							183, 185 },
					{ 89, 38, 4, -19, -15, 17, 36, 83, 59, 71, 65, 68, 66, 67 },
					{ -63, -32, -14, -26, -45, -72, -67, -76, -71, -73, -72,
							-73, -72, -73 },
					{ 0, -8, -18, -8, -3, 16, 37, 40, 38, 39, 38, 39, 38, 39 },
					{ 128, 71, 26, 16, 6, 10, -4, -4, -4, -4, -4, -4, -4, -4 },
					{ -26, -33, 0, 32, 91, 145, 189, 246, 217, 231, 224, 228,
							226, 227 },
					{ 101, 45, 14, 2, 9, 21, 10, 37, 23, 30, 26, 28, 27, 28 },
					{ 63, 26, 10, 16, -1, 14, 16, 102, 59, 80, 69, 75, 72, 73 },
					{ -46, -37, -28, -12, -1, 0, -14, 4, -5, 0, -2, -1, -2, -1 },
					{ -49, -50, -41, -50, -55, -61, -59, -36, -47, -41, -44,
							-43, -43, -43 },
					{ -13, -7, 11, 34, 50, 80, 92, 160, 126, 143, 134, 138,
							136, 137 },
					{ 9, -15, 0, 26, 43, 62, 107, 74, 90, 82, 86, 84, 85, 84 },
					{ -36, -20, -7, -1, -6, -17, -21, -23, -22, -22, -22, -22,
							-22, -22 },
					{ -9, -8, -7, 0, 1, -12, -15, 7, -4, 1, -1, 0, 0, 0 },
					{ 115, 73, 32, 6, -2, -19, -28, -43, -35, -39, -37, -38,
							-37, -38 },
					{ 108, 38, 6, -23, -6, 6, 7, 69, 38, 53, 45, 49, 47, 48 },
					{ 86, 22, -2, -9, -6, 25, 15, 61, 38, 49, 43, 46, 45, 45 },
					{ 28, 8, 0, 0, 4, 13, 18, 36, 27, 32, 30, 31, 30, 30 } } };

	public static void printMatriceTxt(double[][] matrix) {
		for (int i = 0; i < 20; i++)
			System.out.print("\t" + REVERSE[(char) i]);
		System.out.println();
		for (int x = 0; x < 20; x++) {
			for (int y = -1; y <= x; y++) {
				if (y == -1) {
					System.out.print(REVERSE[(char) x] + "\t");
					y++;
				}
				System.out.print(matrix[x][y] + "\t");
			}
			System.out.println();
		}
	}

	public static void printMatriceHtml(double[][] matrix) {
		System.out.println("<!DOCTYPE html PUBLIC \"...\">");
		System.out.println("<html>");
		System.out.println("\t<head>");
		System.out.println("&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;"
				+ "</head>");
		System.out.println("&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "<body>"
				+ "<code>");
		System.out.println("<table> <tr> <td> / </td>");
		for (int i = 0; i < 20; i++)
			System.out.print("<td>" + REVERSE[(char) i] + "</td>");
		System.out.println("</tr><br>");
		for (int x = 0; x < 20; x++) {
			System.out.print("<tr>");
			for (int y = -1; y <= x; y++) {
				if (y == -1) {
					System.out.print("<td>" + REVERSE[(char) x] + "</td>");
					y++;
				}
				System.out.print("<td>" + matrix[x][y] + "</td>");
			}
		}
		System.out.println("</code><br>");
	}
}