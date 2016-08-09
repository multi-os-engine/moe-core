//
//               INTEL CORPORATION PROPRIETARY INFORMATION
//  This software is supplied under the terms of a license agreement or
//  nondisclosure agreement with Intel Corporation and may not be copied
//  or disclosed except in accordance with the terms of that agreement.
//        Copyright (c) 2015 Intel Corporation. All Rights Reserved.
//

#if defined(__cplusplus)
#define EXTERN extern "C"
#else
#define EXTERN extern
#endif

//! Entry point of MOE.
EXTERN int moevm(const int jargc, char *const *jargv);
